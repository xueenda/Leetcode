<?php

$haystack = "mississippi";
$needle = "issip";

function searchStr($haystack, $needle) {
	$lenH = strlen($haystack);
	$lenN = strlen($needle);

    $j = 0;
    $index =0;
    for($i=0; $i<$lenH && $j<$lenN; $i++){
    	echo $index." ".$j."\n";
        if($haystack[$index+$j] == $needle[$j]){
            $j++;
        }else{
            $index++;
            $i= $index-1;
            $j = 0;
        }
    }
    
    return ($j == $lenN) ? $index : -1;
}

echo searchStr($haystack, $needle);

echo "\n";