package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dql implements dix {
    private final /* synthetic */ int a;

    public dql(int i) {
        this.a = i;
    }

    @Override // defpackage.dix
    public final /* synthetic */ dlf a(Object obj, int i, int i2, div divVar) {
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                return new doj((File) obj);
            }
            return new dqg((Bitmap) obj, 1);
        }
        return dqj.g((Drawable) obj);
    }

    @Override // defpackage.dix
    public final /* synthetic */ boolean b(Object obj, div divVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return true;
            }
            return true;
        }
        return true;
    }
}
