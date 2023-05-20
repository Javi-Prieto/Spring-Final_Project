/*const canvas = document.getElementById('benchGraph');

const prElements = document.getElementsByClassName('bench1RM');


const dateElements = document.getElementsByClassName('benchDate');


let benchData = [];

function updateChart() {
	for (let i = 0; i < prElements.length; i++) {
		benchData.push(
			{
				x: dateElements[i].textContent,
				y: parseFloat(prElements[i].textContent)
			}
		);
	}


	const ctx = canvas.getContext('2d');

	if (window.myChart) {
		window.myChart.destroy();
	}

	window.myChart = new Chart(ctx, {
		type: 'line',
		data: {
			datasets: [{
				label: 'Bench Press Progress',
				data: benchData,
				fill: 'origin',
				backgroundColor: 'rgba(85, 0, 0, 0.2)', 
				borderColor: 'rgba(85, 0, 0, 1)', 
				borderWidth: 2 
			}]
		},
		options: {
			responsive: true,
			scales: {
				x: {
					type: 'time',
					time: {
						unit: 'day'
					},
					title: {
						display: true,
						text: 'Date'
					}
				},
				y: {
					title: {
						display: true,
						text: 'Estimated PR'
					}
				}
			}
		}
	});
}

updateChart();*/

