package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doq implements dix {
    private final /* synthetic */ int a;
    private final Object b;

    public doq(int i) {
        this.a = i;
        this.b = new doo();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [dln, java.lang.Object] */
    @Override // defpackage.dix
    public final /* synthetic */ dlf a(Object obj, int i, int i2, div divVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        ImageDecoder.Source createSource3;
        ImageDecoder.Source createSource4;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                createSource4 = ImageDecoder.createSource(dtd.a((InputStream) obj));
                                return elo.q(createSource4, i, i2, divVar);
                            }
                            return dpr.g(((dhm) obj).a(), this.b);
                        }
                        createSource3 = ImageDecoder.createSource((ByteBuffer) obj);
                        return elo.q(createSource3, i, i2, divVar);
                    }
                    dpf dpfVar = (dpf) this.b;
                    return dpfVar.a(new dpp((ParcelFileDescriptor) obj, dpfVar.f, dpfVar.g, 2), i, i2, divVar, dpf.e);
                }
                createSource2 = ImageDecoder.createSource(dtd.a((InputStream) obj));
                return ((doo) this.b).c(createSource2, i, i2, divVar);
            }
            dpf dpfVar2 = (dpf) this.b;
            return dpfVar2.a(new dpp((ByteBuffer) obj, dpfVar2.f, dpfVar2.g, 1), i, i2, divVar, dpf.e);
        }
        createSource = ImageDecoder.createSource((ByteBuffer) obj);
        return ((doo) this.b).c(createSource, i, i2, divVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.dix
    public final /* synthetic */ boolean b(Object obj, div divVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return true;
                            }
                            elo eloVar = (elo) this.b;
                            return elo.r(bpx.m(eloVar.a, (InputStream) obj, (dlu) eloVar.b));
                        }
                        return elo.r(bpx.j(((elo) this.b).a, (ByteBuffer) obj));
                    }
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                    if (((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && !"HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || parcelFileDescriptor.getStatSize() <= 536870912) && djs.d()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public doq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
