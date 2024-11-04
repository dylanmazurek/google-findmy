package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbi implements mww {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cbi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mww
    public final /* synthetic */ Object dt(Object obj, mmx mmxVar) {
        Object i;
        Drawable drawable;
        Object obj2;
        afq afqVar;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            boh bohVar = new boh();
                            ag agVar = (ag) this.a;
                            View view = agVar.P;
                            view.getClass();
                            bohVar.c((ConstraintLayout) view);
                            bohVar.k(R.id.bottom_of_fragment_space_guideline, ((ewi) obj).b);
                            View view2 = agVar.P;
                            view2.getClass();
                            bohVar.b((ConstraintLayout) view2);
                            return mlh.a;
                        }
                        esw eswVar = (esw) obj;
                        eswVar.getClass();
                        Object obj3 = this.a;
                        esu esuVar = (esu) obj3;
                        TextView textView = esuVar.a;
                        if (textView != null) {
                            if (esuVar.b == null) {
                                mpd.b("spotDeviceStateTextHelper");
                            }
                            textView.setText((String) eswVar.a.d.b(new dyv(((ag) obj3).y(), 14)).e(""));
                        }
                        return mlh.a;
                    }
                    boh bohVar2 = new boh();
                    ag agVar2 = (ag) this.a;
                    View view3 = agVar2.P;
                    view3.getClass();
                    bohVar2.c((ConstraintLayout) view3);
                    bohVar2.k(R.id.lower_limit_guideline, ((ewi) obj).b);
                    View view4 = agVar2.P;
                    view4.getClass();
                    bohVar2.b((ConstraintLayout) view4);
                    return mlh.a;
                }
                dic dicVar = (dic) obj;
                afq afqVar2 = null;
                if (dicVar instanceof dif) {
                    drawable = (Drawable) ((dif) dicVar).a;
                } else if (dicVar instanceof die) {
                    Drawable drawable2 = ((die) dicVar).a;
                    drawable = null;
                } else {
                    throw new mku();
                }
                if (drawable != null) {
                    if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        bitmap.getClass();
                        bet betVar = new bet(bitmap);
                        obj2 = new ato(betVar, bef.m(betVar.x(), betVar.w()));
                    } else if (drawable instanceof ColorDrawable) {
                        obj2 = new atp(jw.e(((ColorDrawable) drawable).getColor()));
                    } else {
                        Drawable mutate = drawable.mutate();
                        mutate.getClass();
                        obj2 = new dud(mutate);
                    }
                } else {
                    obj2 = null;
                }
                dhv dhvVar = (dhv) this.a;
                Object g = dhvVar.g();
                if (obj2 != g) {
                    if (g instanceof afq) {
                        afqVar = (afq) g;
                    } else {
                        afqVar = null;
                    }
                    if (afqVar != null) {
                        afqVar.i();
                    }
                    if (obj2 instanceof afq) {
                        afqVar2 = (afq) obj2;
                    }
                    if (afqVar2 != null) {
                        afqVar2.c();
                    }
                    dhvVar.c.h(drawable);
                    dhvVar.d.h(obj2);
                }
                ((dhv) this.a).b.h(dicVar.a());
                return mlh.a;
            }
            ((bcv) this.a).b(((Number) obj).floatValue());
            return mlh.a;
        }
        if ((((ddh) ((hpd) this.a).j).r() instanceof cbv) || (i = ((hpd) this.a).i(true, mmxVar)) != mne.a) {
            return mlh.a;
        }
        return i;
    }
}
