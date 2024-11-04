package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dny implements dnq, dnz {
    private final ContentResolver a;
    private final /* synthetic */ int b;

    public dny(ContentResolver contentResolver, int i) {
        this.b = i;
        this.a = contentResolver;
    }

    @Override // defpackage.dnz
    public final dje a(Uri uri) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new dju(this.a, uri);
            }
            return new dja(this.a, uri);
        }
        return new djm(this.a, uri);
    }

    @Override // defpackage.dnq
    public final dnp b(dnu dnuVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new doa(this);
            }
            return new doa(this);
        }
        return new doa(this);
    }
}
