
CREATE TABLE PRODUCTOS (
  "id" SERIAL NOT NULL,
  "name" VARCHAR(45) NULL,
  "description" VARCHAR(45) NULL,
  "price" DECIMAL(16,2) NULL,
  PRIMARY KEY ("id")
);