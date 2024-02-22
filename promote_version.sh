#!/bin/bash
{
sudo apt-get install xmlstarlet -y

file_name="./$1"

echo $file_name

version=$(xmlstarlet sel -N "ns=http://maven.apache.org/POM/4.0.0" -t -v "/ns:project/ns:version" $file_name)

# Split the version number into its components
IFS='.' read -r -a version_array <<< "$version"

len=${#version_array[@]}
 
# Extract the least significant digit
least_significant=${version_array[len-1]}

# Add 1 to the least significant digit
((least_significant++))

# Reassemble the version number
version_array[len-1]=$least_significant
new_version=$(IFS='.'; echo "${version_array[*]}")

# Use xmlstarlet to update the attribute value
xmlstarlet ed --inplace -N "ns=http://maven.apache.org/POM/4.0.0" -u  "/ns:project/ns:version" -v "${new_version}" $file_name
} > /dev/null 2>&1
# Echo "Original version: $version"
echo "${new_version}"



