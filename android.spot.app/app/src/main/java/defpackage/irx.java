package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irx {
    public float c;
    public WeakReference e;
    public ius f;
    private float g;
    public final TextPaint a = new TextPaint(1);
    public final iut b = new irv(this);
    public boolean d = true;

    public irx(irw irwVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(irwVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.g;
        }
        b(str);
        return this.g;
    }

    public final void b(String str) {
        float measureText;
        float f = 0.0f;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.a.measureText((CharSequence) str, 0, str.length());
        }
        this.g = measureText;
        if (str != null) {
            f = Math.abs(this.a.getFontMetrics().ascent);
        }
        this.c = f;
        this.d = false;
    }

    public final void c(ius iusVar, Context context) {
        if (this.f != iusVar) {
            this.f = iusVar;
            if (iusVar != null) {
                iusVar.d(context, this.a, this.b);
                irw irwVar = (irw) this.e.get();
                if (irwVar != null) {
                    this.a.drawableState = irwVar.getState();
                }
                iusVar.c(context, this.a, this.b);
                this.d = true;
            }
            irw irwVar2 = (irw) this.e.get();
            if (irwVar2 != null) {
                irwVar2.e();
                irwVar2.onStateChange(irwVar2.getState());
            }
        }
    }

    public final void e() {
        this.d = true;
    }
}
