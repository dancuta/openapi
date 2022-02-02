
ECHO OFF
ECHO Start generating model from yaml file

SET TEMP_DIR=%temp%\TESTE_SWAGGER
ECHO TEMP_DIR=%TEMP_DIR%

SET DEST_MODEL=src\main\java\ancuta\example\models
ECHO DEST_MODEL=%DEST_MODEL%


rmdir /s /q %DEST_MODEL%
rd /s /q %TEMP_DIR%
mkdir %TEMP_DIR%
mkdir %DEST_MODEL%

SET OPENCLIENT1=C:\Users\AncutaCosma\Documents\_DOCUMENTE_COSMA_ANCUTA\_PROGRAME\openapi-generator-cli-5.3.0.jar
SET CMD1=java -jar %OPENCLIENT1% generate -i ./src/main/resources/static/swagger.yaml --generator-name spring --model-package ancuta.example.models -o %TEMP_DIR%
ECHO CMD1 = %CMD1%
%CMD1%

SET COPY_CMD=copy %TEMP_DIR%\%DEST_MODEL%\*.java %DEST_MODEL%
ECHO COPY_CMD = %COPY_CMD%
%COPY_CMD%

Rem SET OPENCLIENT2=C:\Users\AncutaCosma\Documents\_DOCUMENTE_COSMA_ANCUTA\_PROGRAME\swagger-codegen-cli-2.2.1.jar
Rem SET CMD2=java -jar %OPENCLIENT2% generate -i ./src/main/resources/swagger.yaml --model-package ancuta.example.models -l spring
Rem %CMD2%






