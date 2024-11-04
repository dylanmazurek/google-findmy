package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyz implements lza {
    public static final lza a = new lyz(0);
    private final /* synthetic */ int b;

    public lyz(int i) {
        this.b = i;
    }

    @Override // defpackage.lzk
    public final InputStream a(InputStream inputStream) {
        if (this.b != 0) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    @Override // defpackage.lzb, defpackage.lzk
    public final String b() {
        if (this.b != 0) {
            return "gzip";
        }
        return "identity";
    }
}
