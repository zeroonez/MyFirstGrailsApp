<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:javascript src="jquery-3.3.1.min.js"/>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.css">
    <script type="text/javascript" charset="utf8"
            src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.js"></script>
    <link rel="stylesheet" type="text/css"
          href="https://cdn.datatables.net/scroller/1.4.4/css/scroller.dataTables.min.css">
    <script type="text/javascript" charset="utf8"
            src="https://cdn.datatables.net/scroller/1.4.4/js/dataTables.scroller.min.js"></script>
    <script type="text/javascript" charset="utf8"
            src="https://cdn.datatables.net/buttons/1.5.1/js/dataTables.buttons.min.js"></script>
    <script type="text/javascript" charset="utf8"
            src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.flash.min.js"></script>
    <script type="text/javascript" charset="utf8"
            src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
    <script type="text/javascript" charset="utf8"
            src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/pdfmake.min.js"></script>
    <script type="text/javascript" charset="utf8"
            src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/vfs_fonts.js"></script>
    <script type="text/javascript" charset="utf8"
            src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.html5.min.js"></script>
    <script type="text/javascript" charset="utf8"
            src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.print.min.js "></script>
</head>

<body>
<div id="list-projects" class="content" role="main">
    <h1>List Of Projects</h1>
    <table id="mytable" class="display compact" style="width:99%;">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Date Created</th>
                <th>Status</th>
                <th>Source Language</th>
            </tr>
        </thead>
    </table>
</div>
<g:javascript>
var table = $('#mytable').DataTable( {
				"scrollY": 500,
				"deferRender": true,
				"scroller": true,
				"dom": "Brtip",
				"buttons": [ 'copy', 'csv', 'excel', 'pdf', 'print' ],
				"processing": true,
				"serverSide": true,
				"ajax": {
					"url": "${createLink(controller: 'project', action: 'getLists')}",
					"type": "GET",
				},

				"columns": [
					{ "data": "id" },
					{ "data": "name"},
					{ "data": "dateCreated"},
					{ "data": "status"},
					{ "data": "sourceLang"}
				]
			});
</g:javascript>
</body>
</html>