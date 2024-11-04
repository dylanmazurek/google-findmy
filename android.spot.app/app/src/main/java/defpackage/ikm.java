package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikm extends ikp implements ikc, ikb, ikj {
    private final FileOutputStream a;
    private final File b;

    public ikm(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.ikb
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.ikj
    public final void b() {
        this.a.getFD().sync();
    }

    @Override // defpackage.ikc
    public final File c() {
        return this.b;
    }
}
