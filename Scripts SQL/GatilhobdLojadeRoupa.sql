CREATE TRIGGER tr_AtualizaTotalVenda
ON tbItensVenda
AFTER INSERT
AS
BEGIN
    -- Atualiza o campo totalVenda na tabela tbVenda com a soma dos subtotais dos itens de venda relacionados à venda
    UPDATE tbVenda
    SET totalVenda = (
        SELECT SUM(subTotalItensVenda)
        FROM tbItensVenda
        WHERE codVenda = (SELECT codVenda FROM inserted)
    )
    WHERE codVenda = (SELECT codVenda FROM inserted);
END;
