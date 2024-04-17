package com.library.imageload.uitls

val imageJsonData = """
    [
        {
            "urls": {
                "raw": "https://images.unsplash.com/photo-1550973886-796d048c599f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "full": "https://images.unsplash.com/photo-1550973886-796d048c599f?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "regular": "https://images.unsplash.com/photo-1550973886-796d048c599f?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "small": "https://images.unsplash.com/photo-1550973886-796d048c599f?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "thumb": "https://images.unsplash.com/photo-1550973886-796d048c599f?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ"
            },
            "color": "#E7EEEE",
            "width": 4000,
            "height": 5000
       },{
            "urls": {
                "raw": "https://images.unsplash.com/photo-1550979068-47f8ec0c92d0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "full": "https://images.unsplash.com/photo-1550979068-47f8ec0c92d0?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "regular": "https://images.unsplash.com/photo-1550979068-47f8ec0c92d0?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "small": "https://images.unsplash.com/photo-1550979068-47f8ec0c92d0?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "thumb": "https://images.unsplash.com/photo-1550979068-47f8ec0c92d0?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ"
            },
            "color": "#F0F0F1",
            "width": 4000,
            "height": 6000
        },
        {
            "urls": {
                "raw": "https://images.unsplash.com/photo-1550947176-68e708cb2dac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "full": "https://images.unsplash.com/photo-1550947176-68e708cb2dac?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "regular": "https://images.unsplash.com/photo-1550947176-68e708cb2dac?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "small": "https://images.unsplash.com/photo-1550947176-68e708cb2dac?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "thumb": "https://images.unsplash.com/photo-1550947176-68e708cb2dac?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ"
            },
            "color": "#ECE1D7",
            "width": 3648,
            "height": 5472
        },
        {
            "urls": {
                "raw": "https://images.unsplash.com/photo-1550916825-64934687f516?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "full": "https://images.unsplash.com/photo-1550916825-64934687f516?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "regular": "https://images.unsplash.com/photo-1550916825-64934687f516?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "small": "https://images.unsplash.com/photo-1550916825-64934687f516?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "thumb": "https://images.unsplash.com/photo-1550916825-64934687f516?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ"
            },
            "color": "#E1D8E0",
            "width": 3456,
            "height": 5184
        },
        {
            "urls": {
                "raw": "https://images.unsplash.com/photo-1551013633-e543f9f3fd20?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "full": "https://images.unsplash.com/photo-1551013633-e543f9f3fd20?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "regular": "https://images.unsplash.com/photo-1551013633-e543f9f3fd20?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "small": "https://images.unsplash.com/photo-1551013633-e543f9f3fd20?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "thumb": "https://images.unsplash.com/photo-1551013633-e543f9f3fd20?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ"
            },
            "color": "#241F1E",
            "width": 2730,
            "height": 4096
        },
        {
            "urls": {
                "raw": "https://images.unsplash.com/photo-1551016001-f6d61bd39702?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "full": "https://images.unsplash.com/photo-1551016001-f6d61bd39702?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "regular": "https://images.unsplash.com/photo-1551016001-f6d61bd39702?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "small": "https://images.unsplash.com/photo-1551016001-f6d61bd39702?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "thumb": "https://images.unsplash.com/photo-1551016001-f6d61bd39702?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ"
            },
            "color": "#0E1417",
            "width": 4139,
            "height": 6209
        },
        {
            "urls": {
                "raw": "https://images.unsplash.com/photo-1551005597-2bbe23dd151e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "full": "https://images.unsplash.com/photo-1551005597-2bbe23dd151e?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "regular": "https://images.unsplash.com/photo-1551005597-2bbe23dd151e?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "small": "https://images.unsplash.com/photo-1551005597-2bbe23dd151e?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "thumb": "https://images.unsplash.com/photo-1551005597-2bbe23dd151e?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ"
            },
            "color": "#E39C42",
            "width": 5472,
            "height": 3648
        },
        {
            "urls": {
                "raw": "https://images.unsplash.com/photo-1550999448-fb569ee4cb6c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "full": "https://images.unsplash.com/photo-1550999448-fb569ee4cb6c?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "regular": "https://images.unsplash.com/photo-1550999448-fb569ee4cb6c?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "small": "https://images.unsplash.com/photo-1550999448-fb569ee4cb6c?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "thumb": "https://images.unsplash.com/photo-1550999448-fb569ee4cb6c?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ"
            },
            "color": "#E0E0DF",
            "width": 3024,
            "height": 4032
        },
        {
            "urls": {
                "raw": "https://images.unsplash.com/photo-1550999280-b8a04844e8e7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "full": "https://images.unsplash.com/photo-1550999280-b8a04844e8e7?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "regular": "https://images.unsplash.com/photo-1550999280-b8a04844e8e7?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "small": "https://images.unsplash.com/photo-1550999280-b8a04844e8e7?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                "thumb": "https://images.unsplash.com/photo-1550999280-b8a04844e8e7?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjU4MjM5fQ"
            },
            "color": "#D7DCE3",
            "width": 2402,
            "height": 3202
        }
    ]
""".trimIndent()
