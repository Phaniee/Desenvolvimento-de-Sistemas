<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    <title>Formulário</title>
</head>
<body>
    <div class="row" ><!--Container para centralizar os outros containers-->
        
        <?php include 'navbar.php'; ?>

        <div class="col-md-6 vh-100  d-flex justify-content-center d-flex align-items-center"> <!-- div para colocar o conteudo php-->
            <div id="image" class="row">
                
          

            <?php
                if (!empty($_GET)) {
                    if (!empty($_POST["nome"])) {

                        // Iniciar a tabela
                        echo '<table class="text-justify" style="font-family:tahoma;">';

                        // Dados pessoais
                        echo '<tr><th colspan="2">Dados Pessoais:</th></tr>';
                        echo '<tr><td>Nome:</td><td>' . $_POST['nome'] . '</td></tr>';
                        echo '<tr><td>E-mail:</td><td>' . $_POST['email'] . '</td></tr>';
                        echo '<tr><td>Idade:</td><td>' . $_POST['idade'] . '</td></tr>';
                        echo '<tr><td>Senha:</td><td>' . $_POST['senha'] . '</td></tr>';
                        echo '<tr><td>Sexo:</td><td>' . $_POST["sexo"] . '</td></tr>';

                        // Interesses
                        if (isset($_POST["numeros"])) {
                            $interesses = implode(", ", $_POST["numeros"]);
                            echo '<tr><th>Interesses:</th><td>' . $interesses . '</td></tr>';
                        } else {
                            echo '<tr><th>Interesses:</th><td>Nenhum selecionado</td></tr>';
                        }

                        // Estado
                        echo '<tr><td>Estado:</td><td>' . $_POST["estado"] . '</td></tr>';

                        // Observação
                        echo '<tr><td>Observação:</td><td>' . $_POST["mensagem"] . '</td></tr>';

                        // Fechar a tabela
                        echo '</table>';
                    }
                } else {
                    echo '<img src="./img/Mobile-login-Cristina.jpg" class="rounded" alt="mulher fazendo cadastro">';
                }
            ?>

            </div>
        </div>
       
            <div class="col-md-6 vh-100  d-flex justify-content-center d-flex align-items-center"><!--parte que inicia o formulario -->

                <form action="index.php?resultado=ok" method="post" style="font-family: tahoma;">
                    <h2 class="pb-2 text-uppercase" style="font-family: Sans Serif; color:black">Cadastro:</h2>
                    <div class="row mb-2 "> <!--parte do código que fica a parte do formulario comum-->
                        <label for="nome" class="col-sm-2 col-form-label">Nome:</label>
                        <div class="col-sm-10">
                        <input type="text" class="form-control" name="nome" required>
                        </div>
                    </div>
                    <div class="row mb-2">
                        <label for="Email" class="col-sm-2 col-form-label ">Email:</label>
                        <div class="col-sm-10">
                        <input type="email" class="form-control" name="email" required>
                        </div>
                    </div>
                    <div class="row mb-2">
                        <label for="idade" class="col-sm-2 col-form-label">Idade:</label>
                        <div class="col-sm-10">
                        <input type="number" class="form-control" name="idade" required>
                        </div>
                    </div>
                    <div class="row mb-2">
                        <label for="senha" class="col-sm-2 col-form-label">Senha:</label>
                        <div class="col-sm-10">
                        <input type="password" class="form-control" name="senha" required>
                        </div>
                    </div>
                    <legend class="col-form-label col-sm-2 pt-0">Sexo:</legend><!--parte do código que fica a parte dos radios--> 
                    <fieldset class="row mb-3"> 
                        <div class="col-sm-10">
                        <div class="form-check">
                            <label class="form-check-label" for="gridRadios1">
                                Masculino
                            </label>
                            <input class="form-check-input" type="radio" name="sexo" id="gridRadios1" value="Masculino" >
                        </div>
                        <div class="form-check">
                            <label class="form-check-label" for="gridRadios2">
                                Feminino
                            </label>
                            <input class="form-check-input" type="radio" name="sexo" id="gridRadios2" value="Feminino">
                        </div>
                        <div class="form-check disabled">
                            <label class="form-check-label" for="gridRadios3">
                                Outros
                            </label>
                            <input class="form-check-input" type="radio" name="sexo" id="gridRadios3" value="Outros" >
                        </div>
                        </div>
                    </fieldset>
                    <legend class="col-form-label col-sm-2 pt-0">Interesses:</legend><!--parte que fica os check box-->
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="futebol" name="numeros[]">
                        <label class="form-check-label" for="flexCheckDefault">
                        Futebol
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="cursos" name="numeros[]" >
                        <label class="form-check-label" for="flexCheckDefault">
                        Cursos
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="moda" name="numeros[]">
                        <label class="form-check-label" for="flexCheckDefault">
                        Moda
                        </label>
                    </div>
                    <legend class="col-form-label col-sm-2 pt-2">Estado:</legend> <!--parte do form com select-->
                    <select class="form-select" aria-label="Default select example" name="estado">
                        <option selected>Selecione uma opção</option>
                        <option value="SP">SP</option>
                        <option value="RJ">RJ</option>
                        <option value="PA">PA</option>
                        <option value="Outros">Outros</option>
                    </select>
                    <div class="mb-3 pt-2">
                        <label for="observacao" class="form-label">Observações:</label><!--caixa de texto-->
                        <textarea class="form-control"  rows="3" name="mensagem"></textarea>
                    </div>
    
                    <button class="btn " style="background-color:#00dfc0;" type="submit" value="Enviar">Enviar</button><!--parte do butão-->
    
    
                </form>
                
            </div>
        <?php include 'footer.php'; ?>   
    </div>
</body>
</html>