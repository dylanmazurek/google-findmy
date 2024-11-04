package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmr implements dmp {
    private final /* synthetic */ int a;

    public dmr(int i) {
        this.a = i;
    }

    @Override // defpackage.dmp
    public final Class a() {
        if (this.a != 0) {
            return ByteBuffer.class;
        }
        return InputStream.class;
    }

    @Override // defpackage.dmp
    public final /* synthetic */ Object b(byte[] bArr) {
        if (this.a != 0) {
            return ByteBuffer.wrap(bArr);
        }
        return new ByteArrayInputStream(bArr);
    }
}
