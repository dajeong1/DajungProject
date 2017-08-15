<?php
    $host = 'localhost';
    $user = 'root';
    $pw = '6389';
    $dbName = 'alarm_db';
    $mysqli = new mysqli($host, $user, $pw, $dbName);
    
    if($mysqli){
    	echo "MySQL 立加 己傍";
    }else{
    	echo "MySQL 立加 角菩";
    }
?>