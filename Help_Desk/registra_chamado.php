<?php 
//teste para ver se está recebendo as informações
echo "<pre>";
print_r ($_POST);
echo "</pre>";

//parte da montagem do texto
$titulo = str_replace('#','-', $_POST ['titulo']);
$categoria = str_replace('#','-', $_POST ['categoria']);
$descricao = str_replace('#','-', $_POST ['descricao']);

//variavel que vai ser usada para guardar os dados
$texto = $titulo . '#'. $categoria . '#'. $descricao . PHP_EOL; 

$arquivo = fopen('arquivo.hd','a');

//parte para escrever o texto no arquivo
fwrite($arquivo, $texto);

//fechando o arquivo
fclose($arquivo);


//echo $texto;
header('Location: abrir_chamado.php');


?>