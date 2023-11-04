import React from 'react';
import { createBoard } from '@wixc3/react-board';
import Layout from '../../../Presentation/Layout.jsx';

export default createBoard({
    name: 'Layout1',
    Board: () => <Layout />,
    environmentProps: {
        windowHeight: 1080,
        windowWidth: 1920
    }
});
