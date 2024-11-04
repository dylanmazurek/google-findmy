package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvu {
    public final Object a;
    public int b;
    public final Object c;

    public kvu(Shader shader, ColorStateList colorStateList, int i) {
        this.c = shader;
        this.a = colorStateList;
        this.b = i;
    }

    public static final long g(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return ((j / 4) * 3) + (j2 / 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        if (!((LinkedHashMap) this.c).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        Object obj;
        if (this.c == null && (obj = this.a) != null && ((ColorStateList) obj).isStateful()) {
            return true;
        }
        return false;
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = (ColorStateList) this.a;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.b) {
                this.b = colorForState;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e() {
        if (!b() && this.b == 0) {
            return false;
        }
        return true;
    }

    public final lv f(int i) {
        lv lvVar = (lv) ((SparseArray) this.a).get(i);
        if (lvVar == null) {
            lv lvVar2 = new lv();
            ((SparseArray) this.a).put(i, lvVar2);
            return lvVar2;
        }
        return lvVar;
    }

    public kvu(dks dksVar) {
        this.a = dtx.a(150, new dkq(this, 1));
        this.c = dksVar;
    }

    public kvu() {
        this.a = new SparseArray();
        this.b = 0;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }

    public kvu(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.c = new Path();
    }

    public kvu(Object obj, int i) {
        this.c = new LinkedHashMap();
        this.a = obj;
        this.b = i;
    }
}
