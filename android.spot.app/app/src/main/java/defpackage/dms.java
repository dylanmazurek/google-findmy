package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dms implements dnq {
    private final /* synthetic */ int a;

    public dms(int i) {
        this.a = i;
    }

    @Override // defpackage.dnq
    public final dnp b(dnu dnuVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return new dne(dnuVar.a(Uri.class, InputStream.class), 3);
                        }
                        return new dne(dnuVar.a(Uri.class, ParcelFileDescriptor.class), 3);
                    }
                    return new dne(dnuVar.a(Uri.class, AssetFileDescriptor.class), 3);
                }
                return new dmu();
            }
            return new dne(new dmr(1), 1);
        }
        return new dne(new dmr(0), 1);
    }
}
