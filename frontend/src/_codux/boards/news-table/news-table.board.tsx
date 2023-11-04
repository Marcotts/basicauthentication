import React from 'react';
import { createBoard } from '@wixc3/react-board';
import NewsTable from '../../../Sections/News/NewsTable.jsx';

export default createBoard({
    name: 'NewsTable',
    Board: () => <NewsTable />,
    environmentProps: {
        canvasWidth: 351,
        canvasHeight: 1080
    }
});
