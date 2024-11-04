package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dio implements dip {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public dio(djs djsVar, dlu dluVar, int i) {
        this.c = i;
        this.b = djsVar;
        this.a = dluVar;
    }

    @Override // defpackage.dip
    public final int a(dil dilVar) {
        dpt dptVar;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                try {
                    dptVar = new dpt(new FileInputStream(((djs) this.b).a().getFileDescriptor()), (dlu) this.a);
                } catch (Throwable th) {
                    th = th;
                    dptVar = null;
                }
                try {
                    int c = dilVar.c(dptVar, (dlu) this.a);
                    dptVar.b();
                    ((djs) this.b).a();
                    return c;
                } catch (Throwable th2) {
                    th = th2;
                    if (dptVar != null) {
                        dptVar.b();
                    }
                    ((djs) this.b).a();
                    throw th;
                }
            }
            try {
                return dilVar.d((ByteBuffer) this.a, (dlu) this.b);
            } finally {
                dtd.b((ByteBuffer) this.a);
            }
        }
        try {
            return dilVar.c((InputStream) this.a, (dlu) this.b);
        } finally {
            ((InputStream) this.a).reset();
        }
    }

    public dio(Object obj, dlu dluVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = dluVar;
    }
}
