<div class="container">
	<div class="row">
		<div class="col-md-3">
			<%@include file="./common/sidemenu.jsp"%>
		</div>	
		<div class="col-md-9"><h1>
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickedAllProducts==true}">
						<script>
							window.categoryId = '';
						</script>
						
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if> 
					
					<c:if test="${userClickCategoryProducts==true}">
						<script>
							window.categoryId = '${category.id}';
						</script>
						
						<ol class="breadcrumb">
						<li>Category</li>
						<li>${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12">
					<table>
					
					</table>
				</div>
			</div>			
		</div>
	</div>
</div>