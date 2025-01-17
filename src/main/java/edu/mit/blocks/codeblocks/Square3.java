package edu.mit.blocks.codeblocks;

public class Square3 {
    private final BlockConnectorShape blockConnectorShape;

    public Square3(BlockConnectorShape blockConnectorShape) {
        this.blockConnectorShape = blockConnectorShape;
    }

    void extracted() {
        blockConnectorShape._lineTo(0, BlockConnectorShape.DATA_PLUG_HEIGHT * 0.15f);
        blockConnectorShape._lineTo(BlockConnectorShape.NORMAL_DATA_PLUG_WIDTH, BlockConnectorShape.DATA_PLUG_HEIGHT * 0.15f);
        blockConnectorShape._lineTo(BlockConnectorShape.NORMAL_DATA_PLUG_WIDTH, BlockConnectorShape.DATA_PLUG_HEIGHT * 0.50f);
        blockConnectorShape._lineTo(-BlockConnectorShape.NORMAL_DATA_PLUG_WIDTH, BlockConnectorShape.DATA_PLUG_HEIGHT * 0.50f);
        blockConnectorShape._lineTo(-BlockConnectorShape.NORMAL_DATA_PLUG_WIDTH, BlockConnectorShape.DATA_PLUG_HEIGHT * 0.85f);
        blockConnectorShape._lineTo(0, BlockConnectorShape.DATA_PLUG_HEIGHT * 0.85f);
        blockConnectorShape._lineTo(0, BlockConnectorShape.DATA_PLUG_HEIGHT);
    }
}