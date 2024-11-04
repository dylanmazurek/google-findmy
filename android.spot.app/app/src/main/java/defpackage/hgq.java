package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hgq implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hgq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, haw] */
    /* JADX WARN: Type inference failed for: r0v41, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [gyy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, hjp] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                hcc hccVar = (hcc) this.a;
                ljn ljnVar = (ljn) this.b;
                ljh ljhVar = (ljh) ljnVar.z(5);
                ljhVar.w(ljnVar);
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                hiw hiwVar = hccVar.f;
                lnh lnhVar = (lnh) ljhVar.b;
                lnh lnhVar2 = lnh.g;
                lnhVar.b = 7;
                lnhVar.a = 1 | lnhVar.a;
                ((hiv) hiwVar).b(3, null, (lnh) ljhVar.q());
                return;
            case 1:
                heo heoVar = (heo) this.a;
                kxm kxmVar = heoVar.A;
                if (kxmVar == null) {
                    return;
                }
                kxl kxlVar = kxmVar.b;
                if (kxlVar == null) {
                    kxlVar = kxl.b;
                }
                kxk kxkVar = kxlVar.a;
                if (kxkVar == null) {
                    kxkVar = kxk.d;
                }
                if ((kxkVar.a & 1) == 0) {
                    ljh ljhVar2 = (ljh) kxkVar.z(5);
                    ljhVar2.w(kxkVar);
                    if (!ljhVar2.b.y()) {
                        ljhVar2.t();
                    }
                    kxk kxkVar2 = (kxk) ljhVar2.b;
                    kxkVar2.a = 1 | kxkVar2.a;
                    kxkVar2.b = 400;
                    ljhVar2.E(kwv.a);
                    kxkVar = (kxk) ljhVar2.q();
                }
                Object obj = this.b;
                heoVar.z.a(obj);
                hav.a(view, (String) obj, kxkVar);
                return;
            case 2:
                bym bymVar = new bym(5);
                hcc hccVar2 = (hcc) this.a;
                hccVar2.l.f(bymVar, view);
                Object obj2 = this.b;
                Object a = hccVar2.b.a();
                ljn ljnVar2 = (ljn) obj2;
                ljh ljhVar3 = (ljh) ljnVar2.z(5);
                ljhVar3.w(ljnVar2);
                if (!ljhVar3.b.y()) {
                    ljhVar3.t();
                }
                hiw hiwVar2 = hccVar2.f;
                lnh lnhVar3 = (lnh) ljhVar3.b;
                lnh lnhVar4 = lnh.g;
                lnhVar3.b = 9;
                lnhVar3.a = 1 | lnhVar3.a;
                hiwVar2.a(a, (lnh) ljhVar3.q());
                hccVar2.c.a.a(view, a);
                return;
            case 3:
                ljn ljnVar3 = (ljn) this.b;
                ljh ljhVar4 = (ljh) ljnVar3.z(5);
                ljhVar4.w(ljnVar3);
                if (!ljhVar4.b.y()) {
                    ljhVar4.t();
                }
                Object obj3 = this.a;
                lnh lnhVar5 = (lnh) ljhVar4.b;
                lnh lnhVar6 = lnh.g;
                lnhVar5.b = 10;
                lnhVar5.a = 1 | lnhVar5.a;
                hcc hccVar3 = (hcc) obj3;
                hccVar3.f.a(null, (lnh) ljhVar4.q());
                hbx hbxVar = hccVar3.c.b;
                AddAccountActivity.a(view);
                return;
            case 4:
                this.a.a(view, this.b.a());
                return;
            case 5:
                ((hgv) this.b).u.f(new bym(5), view);
                ((hgu) this.a).f.onClick(view);
                return;
            case 6:
                hia hiaVar = (hia) this.a;
                hiaVar.e.e.f(new bym(5), view);
                hiaVar.d((hig) this.b, null);
                return;
            case 7:
                hia hiaVar2 = (hia) this.a;
                if (hiaVar2.b) {
                    this.b.f(new bym(5), view);
                    hiaVar2.q(32);
                    hiaVar2.i(false);
                    return;
                }
                return;
            case 8:
                this.a.onClick(view);
                ((iwh) this.b).f(1);
                return;
            default:
                kut kutVar = (kut) this.a;
                List list = kutVar.a.a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("rpc_config_key", kutVar.a);
                bundle.putStringArray("hosts", (String[]) list.toArray(new String[list.size()]));
                kuz kuzVar = new kuz();
                kuzVar.ak(bundle);
                kuw kuwVar = (kuw) this.b;
                kuzVar.aq(kuwVar.a, 235244697);
                kuzVar.q(kuwVar.a.A, "service_override_dialog_tag");
                return;
        }
    }

    public /* synthetic */ hgq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
