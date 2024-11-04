package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijx extends ila {
    private final Context a;
    private final ikz b;
    private final ikz c;
    private final Object d = new Object();
    private String e;

    /* JADX WARN: Type inference failed for: r3v1, types: [ikz, java.lang.Object] */
    public ijx(ksr ksrVar) {
        this.b = new ika((ikg) ksrVar.b);
        this.a = (Context) ksrVar.a;
        this.c = ksrVar.c;
    }

    private final void k() {
        if (this.c != null) {
        } else {
            throw new ikd("Android backend cannot perform remote operations without a remote backend");
        }
    }

    private final boolean l(Uri uri) {
        if (!TextUtils.isEmpty(uri.getAuthority()) && !this.a.getPackageName().equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ila, defpackage.ikz
    public final File b(Uri uri) {
        char c;
        Context createDeviceProtectedStorageContext;
        File filesDir;
        String str;
        Context createDeviceProtectedStorageContext2;
        Context createDeviceProtectedStorageContext3;
        boolean z;
        Account account;
        if (!l(uri)) {
            Context context = this.a;
            if (uri.getScheme().equals("android")) {
                if (!uri.getPathSegments().isEmpty()) {
                    if (TextUtils.isEmpty(uri.getQuery())) {
                        ArrayList arrayList = new ArrayList(uri.getPathSegments());
                        String str2 = (String) arrayList.get(0);
                        switch (str2.hashCode()) {
                            case -1820761141:
                                if (str2.equals("external")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 94416770:
                                if (str2.equals("cache")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 97434231:
                                if (str2.equals("files")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 835260319:
                                if (str2.equals("managed")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 988548496:
                                if (str2.equals("directboot-cache")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 991565957:
                                if (str2.equals("directboot-files")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 0) {
                            if (c != 1) {
                                if (c != 2) {
                                    if (c != 3) {
                                        if (c != 4) {
                                            if (c == 5) {
                                                filesDir = context.getExternalFilesDir(null);
                                            } else {
                                                throw new ikh(String.format("Path must start with a valid logical location: %s", uri));
                                            }
                                        } else {
                                            File file = new File(hqt.f(context), "managed");
                                            if (arrayList.size() >= 3) {
                                                try {
                                                    String str3 = (String) arrayList.get(2);
                                                    Account account2 = ijw.a;
                                                    if ("shared".equals(str3)) {
                                                        account = ijw.a;
                                                    } else {
                                                        int indexOf = str3.indexOf(58);
                                                        if (indexOf >= 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        hrb.l(z, "Malformed account", new Object[0]);
                                                        account = new Account(str3.substring(indexOf + 1), str3.substring(0, indexOf));
                                                    }
                                                    if (!ijw.b(account)) {
                                                        throw new ikh("AccountManager cannot be null");
                                                    }
                                                } catch (IllegalArgumentException e) {
                                                    throw new ikh(e);
                                                }
                                            }
                                            filesDir = file;
                                        }
                                    } else {
                                        filesDir = context.getCacheDir();
                                    }
                                } else {
                                    filesDir = hqt.f(context);
                                }
                            } else if (Build.VERSION.SDK_INT >= 24) {
                                createDeviceProtectedStorageContext3 = context.createDeviceProtectedStorageContext();
                                filesDir = createDeviceProtectedStorageContext3.getCacheDir();
                            } else {
                                throw new ikh(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
                            }
                        } else if (Build.VERSION.SDK_INT >= 24) {
                            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                            filesDir = createDeviceProtectedStorageContext.getFilesDir();
                        } else {
                            throw new ikh(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
                        }
                        File file2 = new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!gad.d(this.a)) {
                            synchronized (this.d) {
                                if (this.e == null) {
                                    createDeviceProtectedStorageContext2 = this.a.createDeviceProtectedStorageContext();
                                    this.e = hqt.f(createDeviceProtectedStorageContext2).getParentFile().getAbsolutePath();
                                }
                                str = this.e;
                            }
                            if (!file2.getAbsolutePath().startsWith(str)) {
                                throw new ikd("Cannot access credential-protected data from direct boot");
                            }
                        }
                        return file2;
                    }
                    throw new ikh("Did not expect uri to have query");
                }
                throw new ikh(String.format("Path must start with a valid logical location: %s", uri));
            }
            throw new ikh("Scheme must be 'android'");
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    @Override // defpackage.ila, defpackage.ikz
    public final InputStream c(Uri uri) {
        if (l(uri)) {
            k();
            return this.c.c(uri);
        }
        return this.b.c(i(uri));
    }

    @Override // defpackage.ikz
    public final String e() {
        return "android";
    }

    @Override // defpackage.ila, defpackage.ikz
    public final boolean h(Uri uri) {
        if (l(uri)) {
            k();
            return this.c.h(uri);
        }
        return this.b.h(i(uri));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ila
    public final Uri i(Uri uri) {
        if (!l(uri)) {
            File b = b(uri);
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            jin jinVar = new jin();
            path.path(b.getAbsolutePath());
            return path.encodedFragment(ikq.a(jinVar.g())).build();
        }
        throw new ikh("Operation across authorities is not allowed.");
    }

    @Override // defpackage.ila
    protected final ikz j() {
        return this.b;
    }
}
