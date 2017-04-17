<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="library">
    <meta name="author" content="me">
    <title>From to add book</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="cover.css" rel="stylesheet">
     <script type="text/javascript" src="http://gc.kis.v2.scr.kaspersky-labs.com/02DCC049-F923-2A47-AA9C-3C7214D5AB18/main.js" charset="UTF-8"></script><script src="../../assets/js/ie-emulation-modes-warning.js"></script>
</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                       <nav>
                        <ul class="nav masthead-nav">
                            <li class="active"><a href="index.html"> homepage</a></li>
                            <li class="active"><a href="allbooks"> all books</a></li>
                            <li class="active"><a href="searchbook.jsp"> search </a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">
            <h2 class="cover-heading">Fullfill the form to add your book</h2>
            <form enctype="multipart/form-data" method="POST" action="addbook">
             <input type="hidden" name="bookId" value="${book.id}">
              <div class="form-group">
                <label for="exampleInput1">Author</label>
                <input type="text" class="form-control" id="exampleInput1" placeholder="enter author of the book" name="author" value="${book.author}" required>
              </div>
              <div class="form-group">
                <label for="exampleInput2">Title of book</label>
                <input type="text" class="form-control" id="exampleInput2" placeholder="enter title of book" name="title" value="${book.title}" required>
              </div>
              <div class="form-group">
                 <label for="exampleInput3">ISBN</label>
                 <input type="text" class="form-control" id="exampleInput3" placeholder="enter isbn" name="isbn" value="${book.isbn}" required>
              </div>
              <div class="form-group">
                 <label for="exampleInput4">Short description of your book </label>
                 <textarea type="text" class="form-control" rows="3" id="exampleInput4" placeholder="enter short description" name="description" value="${book.description}" ></textarea>
              </div>
              <div class="form-group">
                <label for="exampleInputFile">Add file with full text of book </label>
                <input type="file" id="exampleInputFile" name="bookText" value="${book.bookText}">
                <p class="help-block">Example block-level help text here</p>
              </div>
               <div class="form-group">
                   <label for="exampleInputImage">Add cover image of book </label>
                    <input type="file" id="exampleInputImage" name="coverImage" value="${book.coverImage}" required>
                    <p class="help-block">Add jpeg or another .* </p>
           </div>

              <button type="submit" class="btn btn-default">Save your book in library</button>
            </form>



            </div>



            <div class="mastfoot">
                <div class="inner">
                    <p>online book library</p>
                </div>
            </div>

        </div>

    </div>

</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="../../dist/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>