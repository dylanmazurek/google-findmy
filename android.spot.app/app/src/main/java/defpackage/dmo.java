package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmo implements dnq, dmn {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public dmo(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.dmn
    public final dje a(AssetManager assetManager, String str) {
        if (this.b != 0) {
            return new djl(assetManager, str);
        }
        return new djt(assetManager, str);
    }

    @Override // defpackage.dnq
    public final dnp b(dnu dnuVar) {
        if (this.b != 0) {
            return new dmz(this.a, this, 1);
        }
        return new dmz(this.a, this, 1);
    }
}
