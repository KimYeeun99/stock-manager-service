CREATE TABLE company
(
    company_id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '법인 ID',
    name       VARCHAR(50) NOT NULL UNIQUE COMMENT '법인명',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '생성일',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일'
);

CREATE TABLE member_auth
(
    member_id     BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '회원 ID',
    email         VARCHAR(50)  NOT NULL UNIQUE COMMENT '이메일(로그인 ID)',
    password_hash VARCHAR(255) NOT NULL COMMENT '비밀번호 해시',
    last_login    TIMESTAMP NULL COMMENT '마지막 로그인 시간',
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '생성일',
    updated_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일'
);

CREATE TABLE member
(
    member_id    BIGINT PRIMARY KEY COMMENT '회원 ID (member_auth FK)',
    company_id   BIGINT      NOT NULL COMMENT '소속 법인 ID',
    name         VARCHAR(50) NOT NULL COMMENT '회원명',
    role         ENUM('ADMIN', 'USER') DEFAULT 'USER' COMMENT '회원 역할',
    phone_number VARCHAR(11) COMMENT '전화번호',
    status       ENUM('ACTIVE', 'INACTIVE', 'DELETED') DEFAULT 'ACTIVE' COMMENT '회원 상태',
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '생성일',
    updated_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일',
    FOREIGN KEY (member_id) REFERENCES member_auth (member_id) ON DELETE CASCADE,
    FOREIGN KEY (company_id) REFERENCES company (company_id) ON DELETE CASCADE
);

CREATE TABLE product
(
    product_id     BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '상품 ID',
    company_id     BIGINT         NOT NULL COMMENT '소속 법인 ID',
    category_name  VARCHAR(100)   NOT NULL COMMENT '카테고리명',
    name           VARCHAR(255)   NOT NULL COMMENT '상품명',
    description    TEXT COMMENT '상품 설명',
    price          DECIMAL(10, 2) NOT NULL COMMENT '상품 가격',
    stock_quantity INT            NOT NULL DEFAULT 0 COMMENT '재고 수량',
    created_at     TIMESTAMP               DEFAULT CURRENT_TIMESTAMP COMMENT '생성일',
    updated_at     TIMESTAMP               DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일',
    FOREIGN KEY (company_id) REFERENCES company (company_id) ON DELETE CASCADE
)