package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdw implements mdy {
    private final /* synthetic */ int a;

    public mdw(int i) {
        this.a = i;
    }

    @Override // defpackage.mdz
    public final /* synthetic */ int a(mif mifVar, int i, Object obj, int i2) {
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    int limit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + i);
                    mifVar.i(byteBuffer);
                    byteBuffer.limit(limit);
                    return 0;
                }
                mifVar.k((byte[]) obj, i2, i);
                return i2 + i;
            }
            return mifVar.e();
        }
        mifVar.l(i);
        return 0;
    }
}
