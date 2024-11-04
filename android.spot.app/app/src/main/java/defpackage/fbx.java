package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbx extends fbf {
    public String a;
    public int b;
    public int c;

    @Override // defpackage.fbf
    public final /* bridge */ /* synthetic */ void c(fbf fbfVar) {
        fbx fbxVar = (fbx) fbfVar;
        int i = this.b;
        if (i != 0) {
            fbxVar.b = i;
        }
        int i2 = this.c;
        if (i2 != 0) {
            fbxVar.c = i2;
        }
        if (!TextUtils.isEmpty(this.a)) {
            fbxVar.a = this.a;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.a);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.b));
        hashMap.put("screenHeight", Integer.valueOf(this.c));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return a(hashMap);
    }
}
