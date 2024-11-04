package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ewp implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ewp(ewq ewqVar, ewo ewoVar, ews ewsVar, int i) {
        this.d = i;
        this.a = ewqVar;
        this.b = ewoVar;
        this.c = ewsVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("rpc_config_key", (ArrayList) ((kpb) this.a).a);
                ?? r0 = this.c;
                bundle.putStringArray("hosts", (String[]) r0.toArray(new String[r0.size()]));
                kuo kuoVar = new kuo();
                kuoVar.ak(bundle);
                kum kumVar = (kum) this.b;
                kuoVar.aq(kumVar.a, 172954014);
                kuoVar.q(kumVar.a.A, "hostoverride_dialog_tag");
                return;
            }
            ((eqf) this.b).p((kxz) this.a, ((kzc) this.c).b);
            return;
        }
        jni jniVar = (jni) ((jni) ewq.a.e()).j("com/google/android/apps/adm/suggestedaction/SuggestedActionCard", "lambda$setSuggestedActionCardValues$0", 104, "SuggestedActionCard.java");
        Object obj = this.b;
        jniVar.u("[FMD] Showing suggested action: %s", obj);
        ((ewq) this.a).a(lnb.SUGGESTED_ACTION_CLICK_CARD_ACTION, (ewo) obj);
        ((ews) this.c).f.onClick(view);
    }

    public /* synthetic */ ewp(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
