package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hdm implements cfo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hdm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cfo
    public final void d(Object obj) {
        TextView textView;
        byte[] bArr = null;
        int i = 0;
        switch (this.b) {
            case 0:
                jer jerVar = (jer) obj;
                boolean g = jerVar.g();
                Object obj2 = this.a;
                if (g) {
                    hdn hdnVar = (hdn) obj2;
                    hdnVar.I.setImageDrawable((Drawable) jerVar.c());
                    hdnVar.I.setVisibility(0);
                    return;
                }
                ((hdn) obj2).I.setVisibility(8);
                return;
            case 1:
                jer jerVar2 = (jer) obj;
                boolean g2 = jerVar2.g();
                Object obj3 = this.a;
                hdn hdnVar2 = (hdn) obj3;
                hdnVar2.R = g2;
                if (g2) {
                    hdnVar2.H.setOnClickListener(new ecp(obj3, jerVar2, 20, bArr));
                } else {
                    hdnVar2.H.setOnClickListener(null);
                }
                hdnVar2.N(hdnVar2.R);
                return;
            case 2:
                Object obj4 = this.a;
                hdn hdnVar3 = (hdn) obj4;
                Drawable a = ((hdp) obj).a(((hcv) obj4).r, hdnVar3.z);
                hdnVar3.B.setImageDrawable(a);
                if (hdnVar3.Q) {
                    hdnVar3.C.setImageDrawable(a);
                    return;
                }
                return;
            case 3:
                jer jerVar3 = (jer) obj;
                hdn hdnVar4 = (hdn) this.a;
                hdnVar4.L.setVisibility(8);
                hdnVar4.M.setVisibility(8);
                if (((Boolean) jerVar3.b(new gfa(12)).e(false)).booleanValue()) {
                    textView = hdnVar4.M;
                } else {
                    textView = hdnVar4.L;
                }
                if (!jerVar3.g()) {
                    textView.setVisibility(8);
                    hdnVar4.J.setVisibility(8);
                    hdnVar4.K.setVisibility(8);
                    return;
                }
                hdl hdlVar = (hdl) jerVar3.c();
                hdf hdfVar = (hdf) hdlVar.a.f();
                if (hdfVar != null) {
                    textView.setText(hdfVar.a);
                    textView.setContentDescription((CharSequence) hdfVar.b.f());
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                hdnVar4.M(hdnVar4.J, hdlVar.b, hdnVar4.z);
                if (hdnVar4.Q) {
                    hdnVar4.M(hdnVar4.K, hdlVar.b, hdnVar4.z);
                    return;
                }
                return;
            case 4:
                ViewGroup viewGroup = ((hdn) this.a).N;
                if (true != ((Boolean) obj).booleanValue()) {
                    i = 8;
                }
                viewGroup.setVisibility(i);
                return;
            case 5:
                View.OnClickListener onClickListener = (View.OnClickListener) ((jer) obj).f();
                hdn hdnVar5 = (hdn) this.a;
                hdnVar5.O = onClickListener;
                hdnVar5.K(hdnVar5.P, hdnVar5.O);
                return;
            case 6:
                hdf hdfVar2 = (hdf) obj;
                hdn hdnVar6 = (hdn) this.a;
                hdn.O(hdnVar6.D, hdfVar2);
                if (hdnVar6.Q) {
                    hdn.O(hdnVar6.E, hdfVar2);
                    return;
                }
                return;
            case 7:
                jer jerVar4 = (jer) obj;
                hdn hdnVar7 = (hdn) this.a;
                TextView textView2 = hdnVar7.F;
                if (true != jerVar4.g()) {
                    i = 8;
                }
                textView2.setVisibility(i);
                if (!jerVar4.g()) {
                    return;
                }
                hdnVar7.F.setText((CharSequence) jerVar4.c());
                return;
            case 8:
                jis jisVar = (jis) obj;
                hdn hdnVar8 = (hdn) this.a;
                Chip chip = hdnVar8.G;
                if (true == jisVar.isEmpty()) {
                    i = 8;
                }
                chip.setVisibility(i);
                hdnVar8.A.b.c(jisVar);
                hdnVar8.L();
                return;
            case 9:
                ((jer) obj).getClass();
                ijs.e(new hep(this.a, 1));
                return;
            case 10:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                heq heqVar = (heq) this.a;
                heqVar.b = booleanValue;
                heqVar.a(heqVar.c);
                return;
            case 11:
                Boolean bool = (Boolean) obj;
                boolean booleanValue2 = bool.booleanValue();
                hec hecVar = (hec) this.a;
                hecVar.k = booleanValue2;
                hecVar.a(hecVar.g, hecVar.j, hecVar.f, bool.booleanValue());
                return;
            case 12:
                ijs.e(new hep(this.a, 3));
                return;
            case 13:
                hog.H(new hep(this.a, 7));
                return;
            case 14:
                kuj kujVar = (kuj) obj;
                int i2 = kujVar.c - 1;
                Object obj5 = this.a;
                if (i2 != 0) {
                    ((jol) ((jol) ((jol) kup.a.f()).i(kujVar.b)).j("com/google/frameworks/client/data/android/debug/HostnameOverrideFragment", "updateUi", 70, "HostnameOverrideFragment.java")).r("Could not fetch services");
                    Toast.makeText(((ag) obj5).x(), "Could not fetch services", 1).show();
                    return;
                }
                kum kumVar = ((kup) obj5).b;
                jis jisVar2 = kujVar.a;
                lrs lrsVar = new lrs();
                int size = jisVar2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    kut kutVar = (kut) jisVar2.get(i3);
                    lrsVar.d(kutVar.a.a, kutVar);
                }
                jin jinVar = new jin();
                jmw listIterator = lrsVar.b().map.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    ArrayList arrayList = new ArrayList();
                    String str = null;
                    boolean z = false;
                    for (kut kutVar2 : (Collection) entry.getValue()) {
                        arrayList.add(kutVar2.a);
                        String str2 = kutVar2.b;
                        if (str == null) {
                            if (str2 != null) {
                                str = str2;
                            } else {
                                str = (String) hzc.W((Iterable) entry.getKey());
                            }
                        } else if (!str.equals(str2)) {
                            z = true;
                        }
                    }
                    List list = (List) entry.getKey();
                    if (true == z) {
                        str = null;
                    }
                    jinVar.h(new kpb(list, str, arrayList));
                }
                kumVar.e = jinVar.g();
                kumVar.g();
                return;
            default:
                kuj kujVar2 = (kuj) obj;
                int i4 = kujVar2.c - 1;
                Object obj6 = this.a;
                if (i4 != 0) {
                    ((jol) ((jol) ((jol) kva.a.f()).i(kujVar2.b)).j("com/google/frameworks/client/data/android/debug/ServiceOverrideFragment", "updateUi", 60, "ServiceOverrideFragment.java")).r("Could not fetch services");
                    Toast.makeText(((ag) obj6).x(), "Could not fetch services", 1).show();
                    return;
                } else {
                    kuw kuwVar = ((kva) obj6).b;
                    kuwVar.e = kujVar2.a;
                    kuwVar.g();
                    return;
                }
        }
    }
}
