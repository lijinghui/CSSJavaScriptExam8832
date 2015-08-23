// JavaScript Document
$(document)
		.ready(
				function(e) {
					$("#getCu")
							.click(
									function() {
										$
												.getJSON(
														'../CSSJavaScriptExam/getCustomer',
														function(data) {
															var html = '<table style="height:500px;width:900px;overflow-y:scroll">';

															$
																	.each(
																			data,
																			function(
																					entryIndex,
																					entry) {
																				html += '<tr><td><a href="#myModal" role="button" class="btn" data-toggle="modal" data-backdrop="static" " >编辑</a><td><a href="<%=request.getContextPath()%>/DelServlet?+id='+entry.customer_id+'">删除</a></td>'
																						+ '<tr><td>'
																						+ entry.customer_id
																						+ '</td>'
																						+ '<td>'
																						+ entry.store_id
																						+ '</td>'
																						+ '<td>'
																						+ entry.first_name
																						+ '</td>'
																						+ '<td>'
																						+ entry.last_name
																						+ '</td>'
																						+ '<td>'
																						+ entry.email
																						+ '</td>'
																						+ '<td>'
																						+ entry.last_update
																						+ '</td>';

																				html += '</tr>';
																			});
															html += '</table>';
															$("#table").html(
																	html);
															return false;
														});

									});
				});