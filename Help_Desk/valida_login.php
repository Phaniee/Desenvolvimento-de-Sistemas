<?php 

//Iniciar um session para poder confimar se o usuário fez login
session_start();

$usuarios_app = array(
    array('id' => 1, 'email'=> 'admin@teste.com.br','senha' => '1234'),
    array('id' => 2, 'email'=> 'user@teste.com.br','senha' => '1234'),
    array('id' => 3, 'email'=> 'ste@teste.com.br','senha' => '1234'),
);
$usuário_autenticado = false;

foreach ($usuarios_app as $user){
    if($user['email'] == $_POST ['email'] && $user ['senha'] == $_POST ['senha']){
        $usuário_autenticado = true;
    }
}


if($usuário_autenticado){
    //definindo uma variável dentro da session
    $_SESSION['Autenticado']="SIM";
   // echo "Usuário Autenticado";
   header('Location:home.php');
}else{
    //definindo uma variável dentro da session
    $_SESSION['Autenticado']="NÃO";
    //echo "Erro na autenticação do Usuário";
    header('Location:index.php?login=erro');
}

//echo '<pre>';
//print_r($_POST);
//echo '</pre>';










?>