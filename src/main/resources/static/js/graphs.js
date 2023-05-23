const canvasB = document.getElementById('benchGraph');

const prBElements = document.getElementsByClassName('bench1RM');

const dateBElements = document.getElementsByClassName('benchDate');


let benchData = [];
let benchChart;
function updateBenchChart() {
	for (let i = 0; i < prBElements.length; i++) {
		benchData.push(
			{
				x: dateBElements[i].textContent,
				y: parseFloat(prBElements[i].textContent)
			}
		);
	}


	const ctxB = canvasB.getContext('2d');

	if (benchChart) {
		benchChart.destroy();
	}

	benchChart = new Chart(ctxB, {
		type: 'line',
		data: {
			datasets: [{
				label: 'Progreso en Press Banca',
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
						text: 'PR Estimado'
					}
				}
			}
		}
	});
}

updateBenchChart();

const canvasS = document.getElementById('squatGraph');

const prSElements = document.getElementsByClassName('squat1RM');


const dateSElements = document.getElementsByClassName('squatDate');


let squatData = [];
let squatChart;

function updateSquatChart() {
	for (let i = 0; i < prSElements.length; i++) {
		squatData.push(
			{
				x: dateSElements[i].textContent,
				y: parseFloat(prSElements[i].textContent)
			}
		);
	}


	const ctxS = canvasS.getContext('2d');

	if (squatChart) {
		squatChart.destroy();
	}

	squatChart = new Chart(ctxS, {
		type: 'line',
		data: {
			datasets: [{
				label: 'Progreso en Sentadilla',
				data: squatData,
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
						text: 'PR Estimado'
					}
				}
			}
		}
	});
}

updateSquatChart();

const canvaD = document.getElementById('dlGraph')
const dlPRs = document.getElementsByClassName('dl1RM');
const dlDates = document.getElementsByClassName('dlDate');

let dlData = [];
let dlChart;

function updateDlGraph() {
	for (let i = 0; i < dlPRs.length; i++) {
		dlData.push(
			{
				x: dlDates[i].textContent,
				y: parseFloat(dlPRs[i].textContent)
			}
		)
	}

	let ctxD = canvaD.getContext('2d')

	if (dlChart) {
		dlChart.destroy;
	}

	dlChart = new Chart(ctxD, {
		type: 'line',
		data: {
			datasets: [{
				label: 'Progreso en Peso Muerto',
				data: dlData,
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
						text: 'PR Estimado'
					}
				}
			}
		}
	})
}
updateDlGraph();