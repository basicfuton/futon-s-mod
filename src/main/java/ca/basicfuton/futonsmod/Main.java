package ca.basicfuton.futonsmod;

public class Main {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> ROCK_BLOCK = BLOCKS.register("rock",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE))
    );

    public Main() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
