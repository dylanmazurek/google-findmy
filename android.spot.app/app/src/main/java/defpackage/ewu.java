package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ewu implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [ewg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ewg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ewg, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        switch (this.b) {
            case 0:
                ((ewv) this.a).h();
                return;
            case 1:
                Object obj = this.a;
                jer jerVar = jdl.a;
                ewv ewvVar = (ewv) obj;
                jer jerVar2 = ewvVar.g;
                gml gmlVar = ewvVar.m;
                if (jerVar2.g()) {
                    jerVar = eyf.b(gmlVar.a.c(), (lqd) jerVar2.c());
                }
                if (jerVar.g()) {
                    gmlVar.a((lqc) jerVar.c());
                    return;
                } else {
                    gmlVar.a.c().getClass();
                    Collection.EL.stream(gmlVar.a.c()).filter(new ehc(gmlVar, 4)).findAny().ifPresent(new ebd(gmlVar, 12));
                    return;
                }
            case 2:
                hcc hccVar = (hcc) this.a;
                hccVar.c.c.a(view, hccVar.b.a());
                return;
            case 3:
                ((hfd) this.a).performClick();
                return;
            case 4:
                ((hfd) this.a).c.performClick();
                return;
            case 5:
                bym bymVar = new bym(5);
                hfg hfgVar = (hfg) this.a;
                hfgVar.b.f(bymVar, view);
                Object a = hfgVar.d.a();
                hwx.U(frx.aq(a));
                ljh k = kxk.d.k();
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar = k.b;
                kxk kxkVar = (kxk) ljnVar;
                kxkVar.a = 1 | kxkVar.a;
                kxkVar.b = 218;
                if (!ljnVar.y()) {
                    k.t();
                }
                ((kxk) k.b).b().put("hostId", "ogb");
                hav.a(view, frx.ak(a), (kxk) k.q());
                return;
            case 6:
                hgp hgpVar = (hgp) this.a;
                hgpVar.i.f(new bym(5), view);
                hgpVar.a(!hgpVar.h);
                return;
            case 7:
                hgp hgpVar2 = (hgp) this.a;
                hei heiVar = (hei) hgpVar2.j.c();
                hgpVar2.getContext();
                heiVar.a();
                return;
            case 8:
                hia hiaVar = (hia) this.a;
                hiaVar.e.e.f(new bym(5), view);
                if (true != hiaVar.b) {
                    i = 44;
                } else {
                    i = 45;
                }
                hiaVar.q(i);
                hiaVar.i(!hiaVar.b);
                return;
            case 9:
                Object obj2 = this.a;
                hmc hmcVar = ((hmh) obj2).am;
                if (hmcVar != null) {
                    hmcVar.d.f(new bym(5), view);
                }
                ((v) obj2).d();
                return;
            case 10:
                iov iovVar = (iov) this.a;
                if (iovVar.d && iovVar.isShowing()) {
                    iov iovVar2 = (iov) this.a;
                    if (!iovVar2.f) {
                        TypedArray obtainStyledAttributes = iovVar2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        iovVar2.e = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        iovVar2.f = true;
                    }
                    if (iovVar2.e) {
                        ((iov) this.a).cancel();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                gj gjVar = ((isp) view).f;
                isr isrVar = (isr) this.a;
                if (!isrVar.A.A(gjVar, isrVar.z, 0)) {
                    gjVar.setChecked(true);
                    return;
                }
                return;
            case 12:
                Object obj3 = this.a;
                EditText editText = ((ixi) obj3).a;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                ((ixu) obj3).x();
                return;
            case 13:
                ((ixq) this.a).k();
                return;
            default:
                Object obj4 = this.a;
                iya iyaVar = (iya) obj4;
                EditText editText2 = iyaVar.a;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                if (iyaVar.f()) {
                    iyaVar.a.setTransformationMethod(null);
                } else {
                    iyaVar.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    iyaVar.a.setSelection(selectionEnd);
                }
                ((ixu) obj4).x();
                return;
        }
    }

    public ewu(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
