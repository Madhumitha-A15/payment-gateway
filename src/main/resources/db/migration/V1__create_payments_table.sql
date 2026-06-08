CREATE TABLE payments (
                          id            UUID PRIMARY KEY,
                          amount_minor  BIGINT NOT NULL,
                          currency      VARCHAR(3) NOT NULL,
                          status        VARCHAR(30) NOT NULL,
                          created_at    TIMESTAMPTZ NOT NULL DEFAULT now(),
                          updated_at    TIMESTAMPTZ NOT NULL DEFAULT now()
);