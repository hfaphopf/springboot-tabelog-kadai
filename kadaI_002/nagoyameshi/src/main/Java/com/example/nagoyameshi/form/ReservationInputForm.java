<!DOCTYPE html>
 <html xmlns:th="https://www.thymeleaf.org" xmlns:sec="http://www.thymeleaf.org/extras/spring-security"> 
     <head>
         <div th:replace="~{fragment :: meta}"></div>
         
         <div th:replace="~{fragment :: styles}"></div>
         
         <!-- Flatpickr -->
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
         
         <!-- Google Fonts -->
         <link rel="preconnect" href="https://fonts.googleapis.com">
         <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
         <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+JP:wght@400;500&display=swap" rel="stylesheet">   
         
         <link th:href="@{/css/style.css}" rel="stylesheet" >
         
         
         <title>店舗詳細</title>
     </head>
     <body>
		 <div class="nagoyameshi-wrapper">
			 <!-- ヘッダー -->
			 <div th:replace="~{fragment :: header}"></div>
			 
			 <main>
				 <div class="container pt-4 pb-5 nagoyameshi-container">
					 <div class="row justify-content-center">
						 <div class="col-xl-5 col-lg-6 col-md-8">
							 <nav class="mb-4" style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
                                 <ol class="breadcrumb mb-0">                        
                                     <li class="breadcrumb-item"><a th:href="@{/admin/restaurants}">店舗一覧</a></li>
                                     <li class="breadcrumb-item active" aria-current="page">店舗詳細</li>
                                 </ol>
							 </nav>
							 
							 <h1 class="mb-4 text-center" th:text="${restaurant.getName()}"></h1>
							 
							 <div class="d-flex justify-content-end align-items-end mb-3">
								 <div>
									 <a th:href="@{/admin/restaurants/__${restaurant.getId()}__/edit}">編集</a>
								 </div>
							 </div>
							 
						     <div class="mb-3">
								 <img th:if="${restaurant.getImageName()}" th:src="@{/storage/__${restaurant.getImageName()}__}" class="w-100" alt="店舗画像">
								 <img th:unless="${restaurant.getImageName()}" th:src="@{/images/noImage.png}" class="w-100" alt="NO IMAGE">
						     </div>
						     
						     <div class="container mb-4">
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">ID</span>          
                                     </div>
                                     
                                     <div class="col">
                                         <span th:text="${restaurant.getId()}"></span>
                                     </div>
                                 </div>
                                 
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">店舗名</span>
                                     </div>
                                     
                                     <div class="col">
                                         <span th:text="${restaurant.getName()}"></span>
                                     </div>
                                 </div>
                                 
                                     <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">説明</span>
                                     </div>
                                     
                                     <div class="col">
                                         <span class="nagoyameshi-pre-wrap" th:text="${restaurant.getDescription()}"></span>
                                     </div>
                                 </div>
                                 
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">価格帯</span>
                                     </div>
                                     
                                     <div class="col">
                                         <span th:text="${#numbers.formatInteger(restaurant.getPrice(), 1, 'COMMA') + '円'}"></span>
                                     </div>
                                 </div>
                                 
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">郵便番号</span>
                                     </div>
                                     
                                     <div class="col">
                                         <span th:text="${restaurant.getPostalCode()}"></span>
                                     </div>
                                 </div>
                                 
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">住所</span>
                                     </div>
                                     
                                     <div class="col">
                                         <span th:text="${restaurant.getAddress()}"></span>
                                     </div>
                                 </div>
                                 
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">電話番号</span>
                                     </div>
             
                                     <div class="col">
                                         <span th:text="${restaurant.getPhoneNumber()}"></span>
                                     </div>
                                 </div>
                                 
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">営業時間</span>
                                     </div>
             
                                     <div class="col">
                                         <span th:text="${restaurant.getBusinessHours()}"></span>
                                     </div>
                                 </div>
                                 
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">定休日</span>
                                     </div>
             
                                     <div class="col">
                                         <span th:text="${restaurant.getRegularHoliday()}"></span>
                                     </div>
                                 </div>
                                 
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">座席数</span>
                                     </div>
             
                                     <div class="col">
                                         <span th:text="${restaurant.getSeats()}"></span>
                                     </div>
                                 </div>
                                 
                                 <div class="row pb-2 mb-2 border-bottom">
                                     <div class="col-4">
                                         <span class="fw-bold">カテゴリ</span>
                                     </div>
             
                                     <div class="col">
                                         <span th:text="${restaurant.getCategory()}"></span>
                                     </div>
                                 </div>                                
                             </div>                                                  
                 
                         </div>
                     </div>
                 </div>             
             </main>
             
             <!-- フッター -->
             <div th:replace="~{fragment :: footer}"></div>
         </div>    
         
         <div th:replace="~{fragment :: scripts}"></div>
         
         <!-- Flatpickr -->
         <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
         <script src="https://cdn.jsdelivr.net/npm/flatpickr/dist/l10n/ja.js"></script>
         <script th:src="@{/js/flatpickr.js}"></script>
     </body>
 </html>
			 </main>
	 </body>
