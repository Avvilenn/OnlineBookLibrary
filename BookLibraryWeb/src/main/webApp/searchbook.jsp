<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="library">
    <meta name="author" content="me">
    <title>Search book </title>
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
                            <li class="active"><a href="addbook.jsp"> add book </a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">
            <h2 class="cover-heading">Choose search parameters</h2>

            <form class="form-inline" method="POST" action="searchauthor">
              <div class="form-group">
                <label for="exampleInputName2">Author</label>
                <input type="text" class="form-control" id="exampleInputName2" placeholder="enter author surname" name="author" value="${book.author}" required>
              </div>
               <button type="submit" class="btn btn-default">Search book</button>
            </form>
            <hr>
             <form class="form-inline" method="POST" action="searchauthortitle">
               <div class="form-group">
                 <label for="exampleInputName3">Author</label>
                    <input type="text" class="form-control" id="exampleInputName3" placeholder="enter author surname" name="author" value="${book.author}" required>
                   </div>

              <div class="form-group">
                  <label for="exampleInputName4">Title</label>
                   <input type="text" class="form-control" id="exampleInputName4" placeholder="enter book title" name="title" value="${book.title}" required>
             </div>
                  <button type="submit" class="btn btn-default">Search book</button>
             </form>

             <hr>
           <form class="form-inline" method="POST" action="searchdescription">
              <div class="form-group">
                <label for="exampleInputName5">Short description</label>
                <textarea type="text" class="form-control" rows="3" id="exampleInputName5" placeholder="enter short description" name="description" required></textarea>

              </div>
               <button type="submit" class="btn btn-default">Search book</button>
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