<?php
    $host = 'localhost';
    $user = 'root';
    $pw = '6389';
    $dbName = 'alarm_db';
    $mysqli = new mysqli($host, $user, $pw, $dbName);
    
    if($mysqli){
    	echo "MySQL ���� ����";
    }else{
    	echo "MySQL ���� ����";
    }
?>