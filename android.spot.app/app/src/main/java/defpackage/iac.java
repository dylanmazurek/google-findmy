package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iac {
    public static final /* synthetic */ int a = 0;
    private static final iab b;

    static {
        Uri.parse("https://lh3.googleusercontent.com");
        b = new iab();
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return b.a(str);
    }

    public static String b(String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        String str2;
        Set<String> unmodifiableSet;
        boolean z;
        String str3 = str;
        int i7 = iaa.a;
        String b2 = b.b(str, i, i2, i3, i4, i5);
        if (b2 != null) {
            return b2;
        }
        if (i2 == 0) {
            if (i3 != 0) {
                i6 = 0;
            } else {
                return str3;
            }
        } else {
            i6 = i2;
        }
        Pattern pattern = iad.a;
        if (str3 == null) {
            return null;
        }
        if (!iad.a.matcher(str3).find()) {
            str2 = "https://images" + iad.a() + "-esmobile-opensocial.googleusercontent.com/gadgets/proxy";
        } else {
            str3 = null;
            str2 = str3;
        }
        Uri uri = Uri.EMPTY;
        Uri parse = Uri.parse(str2);
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.authority(parse.getAuthority());
        buildUpon.scheme(parse.getScheme());
        buildUpon.path(parse.getPath());
        if (i6 != -1 && i3 != -1) {
            buildUpon.appendQueryParameter("resize_w", Integer.toString(i6));
            buildUpon.appendQueryParameter("resize_h", Integer.toString(i3));
            buildUpon.appendQueryParameter("no_expand", "1");
        }
        buildUpon.appendQueryParameter("fpt", "a7bcfbce29e");
        Uri build = buildUpon.build();
        if (!parse.isOpaque()) {
            String encodedQuery = parse.getEncodedQuery();
            if (encodedQuery == null) {
                unmodifiableSet = Collections.emptySet();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i8 = 0;
                do {
                    int indexOf = encodedQuery.indexOf(38, i8);
                    if (indexOf == -1) {
                        indexOf = encodedQuery.length();
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i8);
                    if (indexOf2 > indexOf || indexOf2 == -1) {
                        indexOf2 = indexOf;
                    }
                    linkedHashSet.add(Uri.decode(encodedQuery.substring(i8, indexOf2)));
                    i8 = indexOf + 1;
                } while (i8 < encodedQuery.length());
                unmodifiableSet = DesugarCollections.unmodifiableSet(linkedHashSet);
            }
            for (String str4 : unmodifiableSet) {
                if (build.getQueryParameter(str4) == null) {
                    boolean z2 = true;
                    if (!"resize_w".equals(str4) && !"resize_h".equals(str4) && !"no_expand".equals(str4)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (i6 != -1 && i3 != -1) {
                        z2 = false;
                    }
                    Uri.Builder buildUpon2 = build.buildUpon();
                    if ("url".equals(str4)) {
                        buildUpon2.appendQueryParameter("url", parse.getQueryParameter("url"));
                    } else if (!z2 || !z) {
                        Iterator<String> it = parse.getQueryParameters(str4).iterator();
                        while (it.hasNext()) {
                            buildUpon2.appendQueryParameter(str4, it.next());
                        }
                    }
                    build = buildUpon2.build();
                }
            }
            if (str3 != null && build.getQueryParameter("url") == null) {
                Uri.Builder buildUpon3 = build.buildUpon();
                buildUpon3.appendQueryParameter("url", str3);
                build = buildUpon3.build();
            }
            if (build.getQueryParameter("container") == null) {
                Uri.Builder buildUpon4 = build.buildUpon();
                buildUpon4.appendQueryParameter("container", "esmobile");
                build = buildUpon4.build();
            }
            if (build.getQueryParameter("gadget") == null) {
                Uri.Builder buildUpon5 = build.buildUpon();
                buildUpon5.appendQueryParameter("gadget", "a");
                build = buildUpon5.build();
            }
            if (build.getQueryParameter("rewriteMime") == null) {
                Uri.Builder buildUpon6 = build.buildUpon();
                buildUpon6.appendQueryParameter("rewriteMime", "image/*");
                build = buildUpon6.build();
            }
            return build.toString();
        }
        throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    }
}
