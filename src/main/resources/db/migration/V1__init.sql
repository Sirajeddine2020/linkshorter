CREATE TABLE URL (
	ID BIGINT auto_increment NOT NULL,
	CODE varchar(10) NOT NULL,
	ORIGINAL varchar(255) NOT NULL,
	CREATED_AT TIMESTAMP DEFAULT NOW() NOT NULL,
	UPDATED_AT TIMESTAMP DEFAULT NOW() NOT NULL,
	CONSTRAINT URL_PK PRIMARY KEY (ID),
	CONSTRAINT UNQ_CODE UNIQUE KEY (CODE),
	CONSTRAINT UNQ_ORGINAL UNIQUE KEY (ORIGINAL)
)

-- CREATE INDEX URL_CODE_IDX USING HASH ON URL (CODE);
CREATE INDEX INDX_CODE
ON URL (CODE);