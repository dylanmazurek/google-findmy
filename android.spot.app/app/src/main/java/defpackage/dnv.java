package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnv implements dnq {
    private final /* synthetic */ int a;
    private final Object b;

    public dnv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dnq
    public final dnp b(dnu dnuVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return new dne((Context) this.b, 5, (char[]) null);
                            }
                            return new dne((Context) this.b, 4, (byte[]) null);
                        }
                        return new dod((ddg) this.b);
                    }
                    return new dmz(this.b, dnt.a, 2);
                }
                return new dmz(this.b, dnuVar.a(Uri.class, InputStream.class), 2);
            }
            return new dne(this.b, 2);
        }
        return new dmz(this.b, dnuVar.a(Uri.class, AssetFileDescriptor.class), 2);
    }

    public dnv(int i) {
        this.a = i;
        this.b = new ddg(500L);
    }
}
