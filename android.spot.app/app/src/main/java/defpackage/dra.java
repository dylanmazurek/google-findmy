package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dra implements dqz {
    public static final dra a = new dra(0);
    private final /* synthetic */ int b;

    public dra(int i) {
        this.b = i;
    }

    @Override // defpackage.dqz
    public final dlf a(dlf dlfVar, div divVar) {
        byte[] bArr;
        if (this.b != 0) {
            ByteBuffer b = ((dqo) dlfVar.c()).b();
            int i = dtd.a;
            oz ozVar = null;
            if (!b.isReadOnly() && b.hasArray()) {
                ozVar = new oz(b.array(), b.arrayOffset(), b.limit());
            }
            if (ozVar != null && ozVar.a == 0 && ozVar.b == ((byte[]) ozVar.c).length) {
                bArr = b.array();
            } else {
                ByteBuffer asReadOnlyBuffer = b.asReadOnlyBuffer();
                byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
                dtd.b(asReadOnlyBuffer);
                asReadOnlyBuffer.get(bArr2);
                bArr = bArr2;
            }
            return new dqg(bArr, 0);
        }
        return dlfVar;
    }
}
