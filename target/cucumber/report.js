$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/stolkacha_lamps_manufacturer_filter.feature");
formatter.feature({
  "line": 1,
  "name": "Lamps Manufacturer Filter",
  "description": "",
  "id": "lamps-manufacturer-filter",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "select \u003cmanufacturer\u003e filter",
  "description": "",
  "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a user is on the Lamps page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user select \u003cmanufacturer\u003e filter item",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "all product titles correspond to the selected manufacturer",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;",
  "rows": [
    {
      "cells": [
        "manufacturer"
      ],
      "line": 9,
      "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;;1"
    },
    {
      "cells": [
        "Philips"
      ],
      "line": 10,
      "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;;2"
    },
    {
      "cells": [
        "Narva"
      ],
      "line": 11,
      "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;;3"
    },
    {
      "cells": [
        "Brevia"
      ],
      "line": 12,
      "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;;4"
    },
    {
      "cells": [
        "Solar"
      ],
      "line": 13,
      "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "select Philips filter",
  "description": "",
  "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a user is on the Lamps page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user select Philips filter item",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "all product titles correspond to the selected manufacturer",
  "keyword": "Then "
});
formatter.match({
  "location": "LampsManufacStepsDefs.aUserIsOnTheLampPage()"
});
formatter.result({
  "duration": 9897120822,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Philips",
      "offset": 12
    }
  ],
  "location": "LampsManufacStepsDefs.userSelectManufacturerFilterItem(Manufacturer)"
});
formatter.result({
  "duration": 2291199436,
  "status": "passed"
});
formatter.match({
  "location": "LampsManufacStepsDefs.allTitesCorrespondToTheSelectedFilterItem()"
});
formatter.result({
  "duration": 3347796021,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "select Narva filter",
  "description": "",
  "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a user is on the Lamps page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user select Narva filter item",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "all product titles correspond to the selected manufacturer",
  "keyword": "Then "
});
formatter.match({
  "location": "LampsManufacStepsDefs.aUserIsOnTheLampPage()"
});
formatter.result({
  "duration": 2061744301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Narva",
      "offset": 12
    }
  ],
  "location": "LampsManufacStepsDefs.userSelectManufacturerFilterItem(Manufacturer)"
});
formatter.result({
  "duration": 2140654471,
  "status": "passed"
});
formatter.match({
  "location": "LampsManufacStepsDefs.allTitesCorrespondToTheSelectedFilterItem()"
});
formatter.result({
  "duration": 3875177300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "select Brevia filter",
  "description": "",
  "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a user is on the Lamps page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user select Brevia filter item",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "all product titles correspond to the selected manufacturer",
  "keyword": "Then "
});
formatter.match({
  "location": "LampsManufacStepsDefs.aUserIsOnTheLampPage()"
});
formatter.result({
  "duration": 1916249096,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brevia",
      "offset": 12
    }
  ],
  "location": "LampsManufacStepsDefs.userSelectManufacturerFilterItem(Manufacturer)"
});
formatter.result({
  "duration": 2119960921,
  "status": "passed"
});
formatter.match({
  "location": "LampsManufacStepsDefs.allTitesCorrespondToTheSelectedFilterItem()"
});
formatter.result({
  "duration": 6638920644,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "select Solar filter",
  "description": "",
  "id": "lamps-manufacturer-filter;select-\u003cmanufacturer\u003e-filter;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a user is on the Lamps page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user select Solar filter item",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "all product titles correspond to the selected manufacturer",
  "keyword": "Then "
});
formatter.match({
  "location": "LampsManufacStepsDefs.aUserIsOnTheLampPage()"
});
formatter.result({
  "duration": 1210722812,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Solar",
      "offset": 12
    }
  ],
  "location": "LampsManufacStepsDefs.userSelectManufacturerFilterItem(Manufacturer)"
});
formatter.result({
  "duration": 2130716929,
  "status": "passed"
});
formatter.match({
  "location": "LampsManufacStepsDefs.allTitesCorrespondToTheSelectedFilterItem()"
});
formatter.result({
  "duration": 2090690816,
  "status": "passed"
});
});