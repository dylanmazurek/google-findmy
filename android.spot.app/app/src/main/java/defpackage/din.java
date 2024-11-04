package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class din implements diq {
    final /* synthetic */ djs a;
    final /* synthetic */ dlu b;

    public din(djs djsVar, dlu dluVar) {
        this.a = djsVar;
        this.b = dluVar;
    }

    @Override // defpackage.diq
    public final ImageHeaderParser$ImageType a(dil dilVar) {
        dpt dptVar;
        try {
            dptVar = new dpt(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
        } catch (Throwable th) {
            th = th;
            dptVar = null;
        }
        try {
            ImageHeaderParser$ImageType a = dilVar.a(dptVar);
            dptVar.b();
            this.a.a();
            return a;
        } catch (Throwable th2) {
            th = th2;
            if (dptVar != null) {
                dptVar.b();
            }
            this.a.a();
            throw th;
        }
    }
}
