#!/bin/bash
# Read from the file file.txt and output the tenth line to stdout.
line_counter=$(wc -l ${1} | awk '{print $1}')
[ ${line_counter} -lt 10 ] && echo "Lines less than 10" && exit 1
sed -n -e '10p' ${$1}
