<div class="container">

	<div class="row">

		<!-- Would be display sideBars -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>




		</div>
		<!-- To display actual Products -->
		<div class="col-md-9">
			<!-- Added breadCrub component breadcrumb:is a readymade bootstaap class which had -->
			<div class="row">
				<div class="col-md-12">
				<c:if test="${userClickAllProducts == true}">
				<ol class="breadcrumb" >
				<li><a href="${contextRoot}/home">Home</a></li>
				<li class="active">All Products</li>
				
				
				
				
				
				</ol>
				</c:if>
					
				
				<c:if test="${userClickCatagoryProducts == true}">
				<ol class="breadcrumb" >
				
				<li><a href="${contextRoot}/home">Home</a></li>
				<li class="active">Catagory</li>
								<li class="active">${catagory.name}</li>
				
				
				
				
				
				
				</ol>
				</c:if>
				
				</div>




			</div>




		</div>




	</div>













</div>