package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktd {
    public final Object a;

    public ktd(Object obj) {
        this.a = obj;
    }

    public static int L(nqe nqeVar, Object obj, Object obj2) {
        return ljd.a((llx) nqeVar.c, 1, obj) + ljd.a((llx) nqeVar.d, 2, obj2);
    }

    public static void M(liv livVar, nqe nqeVar, Object obj, Object obj2) {
        ljd.g(livVar, (llx) nqeVar.c, 1, obj);
        ljd.g(livVar, (llx) nqeVar.d, 2, obj2);
    }

    public static ktd ad(byte[] bArr) {
        return new ktd(knb.b(bArr));
    }

    private static final String ae(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    private static String af(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    private final synchronized String ag(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized String ah(String str) {
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void ai() {
        ?? r0 = this.a;
        long j = r0.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : r0.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void aj(String str) {
        String ah = ah(str);
        if (ah == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(ah, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.a.edit().remove(ah).commit();
        } else {
            this.a.edit().putStringSet(ah, hashSet).commit();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void ak(String str, String str2) {
        aj(str2);
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.a.edit().putStringSet(str, hashSet).commit();
    }

    private final byte[] al(byte[] bArr, byte[] bArr2, int i) {
        Mac mac = (Mac) kmn.b.a((String) this.a);
        if (i <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(bArr, (String) this.a));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i4 = i3 + length;
                if (i4 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, length);
                    i2++;
                    i3 = i4;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private final byte[] am(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) kmn.b.a((String) this.a);
        if (bArr2 != null && bArr2.length != 0) {
            mac.init(new SecretKeySpec(bArr2, (String) this.a));
        } else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], (String) this.a));
        }
        return mac.doFinal(bArr);
    }

    public static String j(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static boolean m(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString(af("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    public final void A(int i, long j) {
        ((liv) this.a).q(i, j);
    }

    public final void B(int i, int i2) {
        ((liv) this.a).an(i, i2);
    }

    public final void C(int i, long j) {
        ((liv) this.a).ap(i, j);
    }

    public final void D(int i, String str) {
        ((liv) this.a).y(i, str);
    }

    public final void E(int i, int i2) {
        ((liv) this.a).B(i, i2);
    }

    public final void F(int i, long j) {
        ((liv) this.a).D(i, j);
    }

    public final /* synthetic */ lel G() {
        ljn q = ((ljh) this.a).q();
        q.getClass();
        return (lel) q;
    }

    public final lfl H() {
        lfl lflVar = ((lel) ((ljh) this.a).b).c;
        if (lflVar == null) {
            lflVar = lfl.c;
        }
        lflVar.getClass();
        return lflVar;
    }

    public final void I(lfl lflVar) {
        ljh ljhVar = (ljh) this.a;
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lel lelVar = (lel) ljhVar.b;
        lel lelVar2 = lel.g;
        lelVar.c = lflVar;
        lelVar.a |= 2;
    }

    public final /* synthetic */ lem J() {
        ljn q = ((ljh) this.a).q();
        q.getClass();
        return (lem) q;
    }

    public final /* synthetic */ lmd K() {
        List unmodifiableList = Collections.unmodifiableList(((lem) ((ljh) this.a).b).e);
        unmodifiableList.getClass();
        return new lmd(unmodifiableList);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized List N() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(ag(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new kqm(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        R(System.currentTimeMillis());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void O() {
        ?? r0 = this.a;
        SharedPreferences.Editor edit = r0.edit();
        int i = 0;
        for (Map.Entry<String, ?> entry : r0.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String ag = ag(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(ag)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(ag);
                    edit.putStringSet(key, hashSet);
                    i++;
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", i);
        }
        edit.commit();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void P() {
        String ag = ag(System.currentTimeMillis());
        this.a.edit().putString("last-used-date", ag).commit();
        aj(ag);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void Q(long j, String str) {
        ?? r0 = this.a;
        String ag = ag(j);
        if (r0.getString("last-used-date", "").equals(ag)) {
            String ah = ah(ag);
            if (ah != null && !ah.equals(str)) {
                ak(str, ag);
                return;
            }
            return;
        }
        long j2 = this.a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            ai();
            j2 = this.a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(ag);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", ag).commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    final synchronized void R(long j) {
        this.a.edit().putLong("fire-global", j).commit();
    }

    final synchronized boolean S(long j, long j2) {
        return ag(j).equals(ag(j2));
    }

    public final synchronized boolean T(long j) {
        return U(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences, java.lang.Object] */
    final synchronized boolean U(long j) {
        if (this.a.contains("fire-global")) {
            if (!S(this.a.getLong("fire-global", -1L), j)) {
                this.a.edit().putLong("fire-global", j).commit();
                return true;
            }
            return false;
        }
        this.a.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final Uri V() {
        String str = ((kpc) this.a).b;
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    public final int W() {
        return ((knb) this.a).a();
    }

    public final byte[] X() {
        return ((knb) this.a).c();
    }

    public final int Y() {
        return Mac.getInstance((String) this.a).getMacLength();
    }

    public final byte[] Z() {
        char c;
        String str = (String) this.a;
        int hashCode = str.hashCode();
        if (hashCode != 984523022) {
            if (hashCode != 984524074) {
                if (hashCode == 984525777 && str.equals("HmacSha512")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals("HmacSha384")) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (str.equals("HmacSha256")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return kfa.h;
                }
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
            return kfa.g;
        }
        return kfa.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized ksn a(String str, String str2) {
        ksn ksnVar;
        ?? r0 = this.a;
        String ae = ae(str, str2);
        ksnVar = null;
        String string = r0.getString(ae, null);
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    ksnVar = new ksn(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                ksnVar = new ksn(string, null, 0L);
            }
        }
        return ksnVar;
    }

    public final byte[] aa(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) {
        return al(bArr, kfa.d(str, bArr2, bArr3, i), i);
    }

    public final byte[] ab(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return am(kfa.c(str, bArr2, bArr3), bArr);
    }

    public final byte[] ac(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return al(am(kfa.c("eae_prk", bArr, bArr3), null), kfa.d("shared_secret", bArr2, bArr3, i), i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void b() {
        this.a.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void c(String str, String str2, String str3, String str4) {
        String str5;
        long currentTimeMillis = System.currentTimeMillis();
        long j = ksn.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", currentTimeMillis);
            str5 = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
            str5 = null;
        }
        if (str5 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(ae(str, str2), str5);
        edit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean d() {
        return this.a.getAll().isEmpty();
    }

    public final Bundle e() {
        Bundle bundle = new Bundle((Bundle) this.a);
        for (String str : ((Bundle) this.a).keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final Integer f(String str) {
        String i = i(str);
        if (!TextUtils.isEmpty(i)) {
            try {
                return Integer.valueOf(Integer.parseInt(i));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + j(str) + "(" + i + ") into an int");
                return null;
            }
        }
        return null;
    }

    public final String g(Resources resources, String str, String str2) {
        String[] strArr;
        String i = i(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        int identifier = resources.getIdentifier(i, "string", str);
        if (identifier != 0) {
            JSONArray k = k(str2.concat("_loc_args"));
            if (k == null) {
                strArr = null;
            } else {
                int length = k.length();
                strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = k.optString(i2);
                }
            }
            if (strArr == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, strArr);
            } catch (MissingFormatArgumentException e) {
                Log.w("NotificationParams", "Missing format argument for " + j(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
                return null;
            }
        }
        Log.w("NotificationParams", j(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
        return null;
    }

    public final String h(Resources resources, String str, String str2) {
        String i = i(str2);
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        return g(resources, str, str2);
    }

    public final String i(String str) {
        if (!((Bundle) this.a).containsKey(str) && str.startsWith("gcm.n.")) {
            String af = af(str);
            if (((Bundle) this.a).containsKey(af)) {
                str = af;
            }
        }
        return ((Bundle) this.a).getString(str);
    }

    public final JSONArray k(String str) {
        String i = i(str);
        if (!TextUtils.isEmpty(i)) {
            try {
                return new JSONArray(i);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + j(str) + ": " + i + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public final boolean l(String str) {
        String i = i(str);
        if (!"1".equals(i) && !Boolean.parseBoolean(i)) {
            return false;
        }
        return true;
    }

    public final void n(int i, boolean z) {
        ((liv) this.a).l(i, z);
    }

    public final void o(int i, lim limVar) {
        ((liv) this.a).m(i, limVar);
    }

    public final void p(int i, double d) {
        ((liv) this.a).ai(i, d);
    }

    public final void q(int i, int i2) {
        ((liv) this.a).s(i, i2);
    }

    public final void r(int i, int i2) {
        ((liv) this.a).o(i, i2);
    }

    public final void s(int i, long j) {
        ((liv) this.a).q(i, j);
    }

    public final void t(int i, float f) {
        ((liv) this.a).ak(i, f);
    }

    public final void u(int i, Object obj, llg llgVar) {
        liv livVar = (liv) this.a;
        livVar.A(i, 3);
        llgVar.m((lkq) obj, livVar.f);
        livVar.A(i, 4);
    }

    public final void v(int i, int i2) {
        ((liv) this.a).s(i, i2);
    }

    public final void w(int i, long j) {
        ((liv) this.a).D(i, j);
    }

    public final void x(int i, Object obj, llg llgVar) {
        ((liv) this.a).u(i, (lkq) obj, llgVar);
    }

    public final void y(int i, Object obj) {
        if (obj instanceof lim) {
            ((liv) this.a).x(i, (lim) obj);
        } else {
            ((liv) this.a).w(i, (lkq) obj);
        }
    }

    public final void z(int i, int i2) {
        ((liv) this.a).o(i, i2);
    }

    public ktd(llx llxVar, Object obj, llx llxVar2, Object obj2) {
        this.a = new nqe(llxVar, obj, llxVar2, obj2);
    }

    public ktd(kpc kpcVar) {
        Bundle bundle;
        if (kpcVar.d == 0) {
            kpcVar.d = System.currentTimeMillis();
        }
        this.a = kpcVar;
        Bundle bundle2 = new Bundle();
        kpcVar.a();
        Bundle bundle3 = kpcVar.a().getBundle("scionData");
        if (bundle3 == null || (bundle = bundle3.getBundle("_cmp")) == null) {
            return;
        }
        kne.w("medium", "utm_medium", bundle, bundle2);
        kne.w("source", "utm_source", bundle, bundle2);
        kne.w("campaign", "utm_campaign", bundle, bundle2);
    }

    public ktd(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public ktd(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public ktd(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(bqq.c(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (!file.createNewFile() || d()) {
                } else {
                    b();
                }
            } catch (IOException unused) {
            }
        }
    }

    public ktd(liv livVar) {
        Charset charset = ljw.a;
        this.a = livVar;
        livVar.f = this;
    }
}
