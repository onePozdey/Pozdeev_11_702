<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Encrypt</title>
</head>
<body>
    <h1>Decrypt</h1>
    <p><a href="/"> <button type="button">Back</button></a></p>
    <hr/>
    <h2>DES: </h2>
    <h3>Upload file and key here: </h3>
    <form enctype="multipart/form-data" method="post" action="/decrypt/des">
        <h5>Encrypted file: </h5>
        <input type="file" name="file">
        <h5>Key file: </h5>
        <input type="file" name="key">
        <button type="submit">Upload</button>
    </form>
    <hr/>
    <h2>RSA: </h2>
    <h3>Upload file and key here: </h3>
    <form enctype="multipart/form-data" method="post" action="/decrypt/rsa">
        <h5>Encrypted file: </h5>
        <input type="file" name="file">
        <h5>Private key file: </h5>
        <input type="file" name="key">
        <button type="submit">Upload</button>
    </form>
    <hr/>
    <h2>AUTO: </h2>
    <h3>Upload file and key here: </h3>
    <form enctype="multipart/form-data" method="post" action="/decrypt/auto">
        <h5>Encrypted file: </h5>
        <input type="file" name="file">
        <h5>Encrypted key file: </h5>
        <input type="file" name="encryptedKey">
        <h5>Private key file: </h5>
        <input type="file" name="privateKey">
        <button type="submit">Upload</button>
    </form>
</body>
</html>